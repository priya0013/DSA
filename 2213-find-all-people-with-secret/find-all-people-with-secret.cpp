class Solution {
public:
    vector<int> findAllPeople(int n, vector<vector<int>>& meetings, int firstPerson) {
        sort(meetings.begin(), meetings.end(),
             [](auto &a, auto &b) { return a[2] < b[2]; });

        vector<int> parent(n), rank(n, 0);
        vector<bool> knows(n, false);

        knows[0] = true;
        knows[firstPerson] = true;

        function<int(int)> find = [&](int x) {
            if (parent[x] != x)
                parent[x] = find(parent[x]);
            return parent[x];
        };

        auto unite = [&](int x, int y) {
            x = find(x);
            y = find(y);
            if (x == y) return;
            if (rank[x] < rank[y]) swap(x, y);
            parent[y] = x;
            if (rank[x] == rank[y]) rank[x]++;
        };

        for (int i = 0; i < meetings.size();) {
            int time = meetings[i][2];
            vector<int> people;
            int j = i;
            while (j < meetings.size() && meetings[j][2] == time) {
                people.push_back(meetings[j][0]);
                people.push_back(meetings[j][1]);
                j++;
            }

            for (int p : people) parent[p] = p;
            for (int k = i; k < j; k++) {
                unite(meetings[k][0], meetings[k][1]);
            }

            unordered_map<int, bool> hasSecret;
            for (int p : people)
                if (knows[p])
                    hasSecret[find(p)] = true;

            for (int p : people)
                if (hasSecret[find(p)])
                    knows[p] = true;

            i = j;
        }

        vector<int> ans;
        for (int i = 0; i < n; i++)
            if (knows[i]) ans.push_back(i);

        return ans;
    }
};
