class Node{
    constructor(element){
        this.element=element;
        this.next=null;
    }
}
class LinkedList{
    constructor(){
        this.head=null;
        this.size=0;
    }
    //methods
    //1. add
    add(element){
        var node=new Node(element);
        // if linked list is empty;
        if(!this.head){
            this.head=node;
        }else{
            var current = this.head;
            while(current.next){
                current=current.next;
            }
            current.next=node;
        }
        this.size++;
    }
    //2. Insert(elem,index)
    insertAt(element,index){
        // if index is greater than size,index is negative;
        // sizeis==0 -invalid
        if(index>this.size|| index<0 && this.size){
            return false;
        }
        var node = new Node(element);
        var current = this.head;
        var prev =null;
        var i=0;
        if(index==0){
            node.next=current;
            this.head=node;
        }else{
            while(i<index){
                prev = current;
                current=current.next;
                i++;
            }
            // insert at the index
            prev.next=node;
            // move to the inserted node
            prev=prev.next;
            // add the rest of the current to the inserted node
            prev.next = current;
            //increment size
            this.size++;
        }
    }
    //3. delete(elem)
    removeElement(element){
        var current=this.head;
        var prev=null;
        while(current){
            if(current.element==element){
                if(prev==null){
                    this.head=current.next;
                }
                else{
                    prev.next = current.next;
                }
                this.size--;
                console.log("removed element",element);
                return true;
            }
            prev=current;
            current=current.next;
        }
    }
    //4. Print
    printList(){
        var current=this.head;
        var index=0;
        while(current){
            console.log("element-"+current.element,"index-"+index++);
            current=current.next;
        }
    }
    //5.isEmpty
    isEmpty(){
        return this.size===0?true:false
    }
    //6. Size
    sizeofLL(){
      return this.size;
    }
}

var list=new LinkedList();
list.add(1);
list.add(2);
list.insertAt(5,1);
list.removeElement(5);
console.log(list.sizeofLL());
list.printList();


/*
function Elem(name,score){
    this.name=name;
    this.score=score;
}
const elem=new Elem("Sudhir",50);
const node=new Node(elem);
// const elem=new Node(50);
console.log(node);
*/