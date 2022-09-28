#include<stdio.h>
int main(void)
{
	int A, B;
	scanf("%d %d", &A, &B);
	int num = B % 100 % 10;
	int num2 = B % 100 - num;
	int num3 = B - num2 - num;
	int sum1 = A * num;
	printf("%d\n", sum1);
	int sum2 = A * num2;
	printf("%d\n", sum2/10);
	int sum3 = A * num3;
	printf("%d\n", sum3/100);
	printf("%d\n", sum1 + sum2 + sum3);

	return 0;
}