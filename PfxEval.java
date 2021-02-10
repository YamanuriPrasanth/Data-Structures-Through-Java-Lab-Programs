import java.util.*;
class Stack1
{
    int top = -1;
    int stk[] = new int[10];
    void push(int x)
    {
        stk[++top] = x;
    }
    int pop()
    {
        return stk[top--];
    }
}
class PfxEval
   {
       public static void main(String[] args)
       {
           Scanner s=new Scanner(System.in);
           Stack1 x=new Stack1();
           String pfx;
           int p,q,reval=0;
           System.out.println("Enter the postfix expression");
           pfx=s.nextLine();
           for(int i=0;i<pfx.length();i++)
           {
               if(Character.isDigit(pfx.charAt(i)))
                   x.push(pfx.charAt(i)-'0');
               else
               {
                   q=x.pop();
                   p=x.pop();
                   switch(pfx.charAt(i))
                   {
                       case '+':reval=p+q;
                       break;
                       case '-':reval=p-q;
                           break;
                       case '*':reval=p*q;
                           break;
                       case '/':reval=p/q;
                           break;
                       case '%':reval=p%q;
                           break;
                       case '^':reval=(int)Math.pow(p,q);
                           break;
                       default:break;
                   }
                   x.push(reval);
               }
           }
           System.out.println(x.pop());
       }
   }
