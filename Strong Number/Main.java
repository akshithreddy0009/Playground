#include <stdio.h>
int main() {
  int n,i,sum=0,fact,rem;
  scanf("%d",&n);
  int num=n;
  while(n>0)
  {
  rem=n%10;
    fact=1;
    for(i=1;i<=rem;i++)
      fact=fact*i;
    sum=sum+fact;
    n=n/10;
  }
  if(sum==num)
    printf("Yes");
  else
    printf("No");
	return 0;
}