struct ListNode* removeElements(struct ListNode* head, int val) {
    struct ListNode *t=head;
    struct ListNode *p=NULL;
    while(t!=NULL){
        if(t->val==val){
            if(p==NULL){
                head=t->next;
                free(t);
                t=head;
            }
            else{
                p->next=t->next;
                free(t);
                t=p->next;
            }
        }
        else{
            p=t;
            t=t->next;
        }
    }
    return head;
}