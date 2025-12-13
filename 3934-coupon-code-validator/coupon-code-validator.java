import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] line, boolean[] active) {

        List<String> order = List.of("electronics","grocery","pharmacy","restaurant");
        List<String> res = new ArrayList<>();

        for (int i = 0; i < code.length; i++)
            if (active[i] && order.contains(line[i]) &&
                !code[i].isEmpty() && code[i].matches("\\w+"))
                res.add(line[i] + "#" + code[i]);

        Collections.sort(res, (a, b) -> {
            int x = order.indexOf(a.split("#")[0]);
            int y = order.indexOf(b.split("#")[0]);
            return x != y ? x - y : a.compareTo(b);
        });

        return res.stream().map(s -> s.split("#")[1]).toList();
    }
}
