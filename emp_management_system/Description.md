
Create Java application for emp management system
Requirements 
1.1 It should be able to store n restore emp details in a bin file using object streams
1.2 Emp details : id(string), first name , last name , dept(enum : RND,HR,SALES,FINANCE,PRODUCTION), joining date(LocalDate),salary
1.3 Let's say that : Company is only 3 years old. (so think of a validation rule on joining date)

1.4 Add required parsing / validation methods n custom exceptions

1.5 Ask yourself : where will you perform serialization(store detail) ---before terminating app(exit option)

 n de-serialization(restore details) ? -- in beginning of the app

Options
All CRUD operations MUST happen in constant time performance.
1. Hire new emp
2. List all emp details
3. Promote an emp
4. Delete emp details
5. Sort emps as per join date n display the same.
6. We can add many more options here.....
0. Exit
