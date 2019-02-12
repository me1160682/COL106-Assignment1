# COL106-Assignment1
The first assignment of COL106: Data Structures And Algorithms at IITD.
The file SingleNode creates a class which contains a generic type element and a pointer to the next SingleNode.
SingelyLinkedList uses this class SingleNode to implement a SingelyLinkedList.
MyStack uses SingelyLinkedList to implement the Abstract Data Type Stack.
Tower Of Hanoi with recursion uses recursion to solve the problem where each function makes two function calls unless the terminating condition is reached.
Tower of Hanoi without recursion uses a stack to simulate recursion where every time a function call was made in the recursion method, tuple(which stores the parameters sent to the function) was pushed onto the stack. Every time the cnotrol returned to a function(correspondingly when the peek() returned that function from the stack) for the second time a boolean is changed to remark that if the stack index again reaches the tuple it will be popped.
Similar arguments follow for the generalized tower of hanoi.
