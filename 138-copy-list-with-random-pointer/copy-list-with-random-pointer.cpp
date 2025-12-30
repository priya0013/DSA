/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
public:
    Node* copyRandomList(Node* head) {
         Node* nh = NULL;
        Node* nt = NULL;

        map<Node*, Node*> mp;
        Node *cur, *cur2;
        for (cur = head; cur != NULL; cur = cur->next) {
            Node* nn = new Node(cur->val);
            mp[cur] = nn;

            if (nh == NULL) {
                nh = nt = nn;
            } else {
                nt->next = nn;
                nt = nn;
            }
        }
        for (cur = head, cur2 = nh; cur != NULL; cur = cur->next, cur2 = cur2->next) {
            cur2->random = mp[cur->random]; 
        }

        return nh;
    }
    
};