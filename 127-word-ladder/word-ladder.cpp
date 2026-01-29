class Solution {
public:
    int ladderLength(string beginWord, string endWord, vector<string>& wordList) {
        set<string> words(wordList.begin(),wordList.end());
        if(!words.contains(endWord))return 0;
        queue<string> q;
        q.push(beginWord);
        int lev=1;
        while(!q.empty()){
            int si=q.size();
            while(si-->0){
                string p=q.front();
                q.pop();
                if(p==endWord)return lev;
                for(int i=0;i<p.size();i++){
                    char temp=p[i];
                    for(char ch='a';ch<='z';ch++){
                        p[i]=ch;
                        if(words.contains(p)){
                            words.erase(p);
                            q.push(p);
                        }
                    }
                    p[i]=temp;
                }
            }
            lev++;
        }
        return 0;
    }
};