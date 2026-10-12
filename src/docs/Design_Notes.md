

1.Why you used ArrayList instead of array?
Ans: ArrayList is resizable . It can grow and shrink dynamically hence easy 
for quick easy additions, deletion and updation process with builtin method support like add, remoce,contains etc


2.Where you used static members and why?

I have used static variables and static methods so that they can be used directly without creating object of that class.
getNextStudentID is a static method defined in class IDgenerator.
static variable is a class variable shared among all the instances of that class which gives same value of counter on invocation.

3. Where you used inheritance and what you gained from it?
I have used inheritance to reuse existing attributes of Person class in Student class so that I dont have to rewrite / reusereducing the redundant code.
