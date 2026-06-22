/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    int pairSum(ListNode* head) {
        stack<ListNode *> st;
        ListNode * root = head;
        while(root){
            st.push(root);
            root = root->next;
        }
        int n = st.size();
root = head;
int maxe = 0;

for (int i = 0; i < n / 2; i++) {
    maxe = max(maxe, root->val + st.top()->val);
    root = root->next;
    st.pop();
}

        return maxe;
    }
};