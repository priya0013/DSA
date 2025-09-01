class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>(new Comparator<double[]>() {
            public int compare(double[] a, double[] b) {
                return Double.compare(b[0], a[0]); 
            }
        });

        for (int[] c : classes) {
            int pass = c[0], total = c[1];
            pq.offer(new double[]{gain(pass, total), pass, total});
        }

        while (extraStudents-- > 0) {
            double[] cur = pq.poll();
            int pass = (int) cur[1], total = (int) cur[2];
            pass++;
            total++;
            pq.offer(new double[]{gain(pass, total), pass, total});
        }

        double sum = 0.0;
        for (double[] c : pq) {
            sum += c[1] / c[2];
        }
        return sum / classes.length;
    }

    private double gain(int pass, int total) {
        return (double)(pass + 1) / (total + 1) - (double) pass / total;
    }
}
