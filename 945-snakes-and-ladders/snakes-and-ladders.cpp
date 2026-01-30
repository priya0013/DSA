class Solution {
public:
    int snakesAndLadders(vector<vector<int>>& board) {
        int n = board.size();
        vector<bool> visited(n*n + 1, false);
        queue<int> q;

        q.push(1);
        visited[1] = true;
        int move = 0;

        while (!q.empty()) {
            int size = q.size();
            unordered_set<int> levelSeen;

            while (size--) {
                int cur = q.front(); q.pop();
                if (cur == n*n) return move;

                for (int dice = 1; dice <= 6 && cur + dice <= n*n; dice++) {
                    int next = cur + dice;

                    int row = (next - 1) / n;
                    int col = (next - 1) % n;
                    if (row % 2 == 1) col = n - 1 - col;
                    row = n - 1 - row;

                    if (board[row][col] != -1)
                        next = board[row][col];

                    if (!visited[next] && !levelSeen.count(next)) {
                        levelSeen.insert(next);
                        visited[next] = true;
                        q.push(next);
                    }
                }
            }
            move++;
        }
        return -1;
    }
};
