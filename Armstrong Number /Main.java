#include <stdio.h>
#include<math.h>
int main() {
  int n,rem,sum=0,power,len=0;
  scanf("%d",&n);
  int x=n;
  int num=n;
  while(x>0)
  {
  len++;
    x=x/10;
  }
  while(n>0)
  {
  rem=n%10;
    power=pow(rem,len);
    sum=sum+power;
    n=n/10;
  }
  if(sum==num)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
  return 0;
}