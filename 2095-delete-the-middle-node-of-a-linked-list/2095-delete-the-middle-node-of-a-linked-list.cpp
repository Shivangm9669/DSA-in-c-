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
    ListNode* deleteMiddle(ListNode* head) {
        if(!head->next){
            head=nullptr;
            return head;
        }
        ListNode * slow = head;
        ListNode * fast = head->next;
        ListNode * prev = nullptr;

        while(fast && fast->next){
            prev = slow;
            slow = slow->next;
            fast = fast->next->next;
        }

        ListNode * curr = nullptr;

        if(!fast){
            curr = prev->next;
            prev->next = prev->next->next;
        }else{
            curr = slow->next;
            slow->next = slow->next->next;
        }
        curr->next = nullptr;

        return head;

    }
};