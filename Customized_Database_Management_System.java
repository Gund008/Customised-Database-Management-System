import java.util.*;
import java.lang.String;

class Student
{
    //characteristics
    public String Sname;
    public int iMarks;
    public int iRollno;

    public static int Genrator;

    static
    {
        Genrator=0;
    }

    //Parametersied Constructor
    public Student(String str,int iNo)
    {
        this.Sname=str;
        this.iMarks=iNo;
        Genrator++;                  //auto Incremented rollno Genrator=Genrator + 1;
        this.iRollno=Genrator;
    }
    
    public void Display()
    {
        System.out.println("Roll No:"+iRollno+" Name: "+Sname+" Marks:" +iMarks);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////

class DBMS
{
    public LinkedList <Student> lobj;  //Reference

    DBMS()
    {
        lobj=new LinkedList<>();  //Memory Allocation
    }

    public void StartDBMS()
    {
        System.out.println("Marvellous Customised DBMS Started Succesfully...");

        Scanner sobj=new Scanner(System.in);
        String Query=" ";
        int QuerySize=0;

        while(true)
        {
            System.out.println();
            System.out.println("Marvellous DBMS : >");
            Query=sobj.nextLine();

            String Tokens[]=Query.split(" ");
            QuerySize=Tokens.length;

            if(QuerySize == 1)
            {
                if("help".equals(Tokens[0]))
                {
                    System.out.println();
                    System.out.println("This Application used to demonstrate the fetures of customised dbms");
                    System.out.println();
                    System.out.println("Display all data:  select *from student");
                    System.out.println("Insert new record:  insert into student values Name Marks");
                    System.out.println("Display specific roll no:  select *from  student where rollno=Rollno");
                    System.out.println("Display specific name:  select *from  student where name=Name");
                    System.out.println("Delete specific roll no:  delete from  student where rollno=Rollno");
                    System.out.println("Delete specific name:  delete from  student where name=Name");
                    System.out.println("Sum of specific columns in student marks:  select sum marks from student");
                    System.out.println("Average of specific columns in student marks: select avg marks from student");
                    System.out.println("Maximum of specific columns in student marks :select max marks from student");
                    System.out.println("Minimum of specific columns in student marks :select min marks from student");
                    System.out.println("Count of columns in  student marks: select min marks from student");

                    System.out.println("Terminate the project:exit");

                }
                else if("exit".equals(Tokens[0]))
                {
                    System.out.println("Thank you For Using our customised DBMS:");
                    break;
                }
            }
            else if(QuerySize == 4)
            {
                if("select".equals(Tokens[0]))
                {
                    if("*".equals(Tokens[1]))
                    {
                        if("from".equals(Tokens[2]))
                        {
                            if("student".equals(Tokens[3]))
                            {
                                DisplayAll();
                            }
                        }
                    }
                }
            }
            else if(QuerySize == 5)
            {
                if("select".equals(Tokens[0]))
                {
                    if("sum".equals(Tokens[1]))
                    {
                        if("marks".equals(Tokens[2]))
                        {
                            if("from".equals(Tokens[3]))
                            {
                                if("student".equals(Tokens[4]))
                                {
                                    Sum();
                                }
                            }
                        }
                    }
                }
                else if("select".equals(Tokens[0]))
                {
                    if("avg".equals(Tokens[1]))
                    {
                        if("marks".equals(Tokens[2]))
                        {
                            if("from".equals(Tokens[3]))
                            {
                                if("student".equals(Tokens[4]))
                                {
                                    Avg();
                                }
                            }
                        }
                    }
                }
                else if("select".equals(Tokens[0]))
                {
                    if("max".equals(Tokens[1]))
                    {
                        if("marks".equals(Tokens[2]))
                        {
                            if("from".equals(Tokens[3]))
                            {
                                if("student".equals(Tokens[4]))
                                {
                                    Max();
                                }
                            }
                        }
                    }
                }
                else if("select".equals(Tokens[0]))
                {
                    if("min".equals(Tokens[1]))
                    {
                        if("marks".equals(Tokens[2]))
                        {
                            if("from".equals(Tokens[3]))
                            {
                                if("student".equals(Tokens[4]))
                                {
                                    Min();
                                }
                            }
                        }
                    }
                }
                else if("select".equals(Tokens[0]))
                {
                    if("count".equals(Tokens[1]))
                    {
                        if("marks".equals(Tokens[2]))
                        {
                            if("from".equals(Tokens[3]))
                            {
                                if("student".equals(Tokens[4]))
                                {
                                    Count();
                                }
                            }
                        }
                    }
                }   
            }
            else if(QuerySize == 6)
            {
               if("insert".equals(Tokens[0]))
                {
                    if("into".equals(Tokens[1]))
                    {
                        if("student".equals(Tokens[2]))
                        {
                            if("values".equals(Tokens[3]))
                            {
                                Insert(Tokens[4],Integer.parseInt(Tokens[5]));
                            }
                        }
                    }
                }
            }
            else if(QuerySize == 7)
                {
                    if("delete".equals(Tokens[0]))
                    {
                        if("from".equals(Tokens[1]))
                        {
                            if("student".equals(Tokens[2]))
                            {
                                if("where".equals(Tokens[3]))
                                {
                                    if("Rollno".equals(Tokens[4]))
                                    {
                                        Delete(Integer.parseInt(Tokens[6]));
                                    }
                                }
                            }
                        }
                    }
                    else if("delete".equals(Tokens[0]))
                    {
                        if("from".equals(Tokens[1]))
                        {
                            if("student".equals(Tokens[2]))
                            {
                                if("where".equals(Tokens[3]))
                                {
                                    if("name".equals(Tokens[4]))
                                    {
                                        Delete(Tokens[6]);
                                    }
                                }
                            }
                        }
                    }
                }
                else if(QuerySize == 8)
                {
                    if("select".equals(Tokens[0]))
                    {
                        if("*".equals(Tokens[1]))
                        {
                            if("student".equals(Tokens[3]))
                            {
                                if("where".equals(Tokens[4]))
                                {
                                    if("roll no".equals(Tokens[5]))
                                    {
                                        DisplaySpecific(Integer.parseInt(Tokens[7]));
                                    }
                                }
                            }
                        }
                    }
                    else if("select".equals(Tokens[0]))
                    {
                        if("*".equals(Tokens[1]))
                        {
                            if("student".equals(Tokens[3]))
                            {
                                if("where".equals(Tokens[4]))
                                {
                                    if("name".equals(Tokens[5]))
                                    {
                                        DisplaySpecific(Tokens[7]);
                                    }
                                }
                                   
                            }
                        }
                    }
                
                }
        }//while loop

    }//start dbms


    //All SQL queries Should be Implemented

    //insert into student values(_ , _);
    public void Insert(String str,int iNo)  //(name,rollno)
    {
        Student sobj=new Student(str, iNo);
        lobj.add(sobj);
    }


    //select *from student;
    public void DisplayAll()
    {
        for(Student sref :lobj)  
        {
            sref.Display();
        }
    }


    //select *from  student where Rollno=3
    public void DisplaySpecific(int iValue)
    {
        for(Student sref:lobj)
        {
            if(sref.iRollno == iValue)
            {
                sref.Display();
                break;
            }
        }
    }


    //select *from  student where Name='Rutuja'
    public void DisplaySpecific(String str)
    {
        for(Student sref:lobj)
        {
            if(str.equals(sref.Sname))
            {
                sref.Display();
                break;
            }
        }
    }


    //delete from  student where RollNo=3
    public void Delete(int iNo)
    {
        int index=0;

        for(Student sref: lobj)
        {
            if(sref.iRollno==iNo)
            {
                lobj.remove(index);
                break;
            }
            index++;
        }
    }


    //delete from  student where Sname='Ram'
    public void Delete(String str)
    {
        int index=0;
    
        for(Student sref: lobj)
        {
            if(str.equals(sref.Sname))
            {
                lobj.remove(index);
                break;
            }
            index++;
        }
    }


    //select sum (marks) from student
    public void Sum()
    {
        int iSum=0;

        for(Student sref:lobj)
        {
            iSum=iSum + (sref.iMarks);
        }
        System.out.println("Summation of Marks :"+iSum);
    }


    //select Avg (marks) from student
    public void Avg()
    {
        int iSum=0;

        for(Student sref:lobj)
        {
            iSum=iSum + (sref.iMarks);
        }
        System.out.println("Average of Marks :"+(iSum / lobj.size()));
    }


    //select max (marks) from student
    public void Max()
    {
        int iMax=0;

        for(Student sref:lobj)
        {
           if(iMax < (sref.iMarks))
           {
                iMax=sref.iMarks;
           }   
        }
        System.out.println("Maximum of Marks :"+iMax);
    }
   

    //select max (marks) from student
    public void Min()
    {
        Student s=lobj.get(0);
        int iMin=s.iMarks;

        for(Student sref:lobj)
        {
           if(iMin > (sref.iMarks))
           {
                iMin=sref.iMarks;
           }   
        }
        System.out.println("Minimum of Marks :"+iMin);
    }

    // select count(marks) from student
    public void Count()
    {
        int iCnt=0;

        for(Student sref:lobj)
        {
            iCnt=iCnt + 1;
        } 
        System.out.println("Count of Student Marks:"+iCnt);
    }
}

public class Program448 
{
    public static void main(String arg[])
    {
        DBMS dobj=new DBMS();

        dobj.StartDBMS();
    }
}







