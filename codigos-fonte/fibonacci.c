#include <stdio.h>

int fibonacci(int termos){
	//Certamente há maneiras mais elegantes de representar um inteiro de 64 bits.
	unsigned long long int a = 0;
	unsigned long long int b = 1;
	unsigned long long int ac = 0;
	for (int idx = 0; idx < termos; idx++){
		printf("%llu\n", a);
		ac = a + b;
		a = b;
		b = ac;
	}
	return 0;
}

int main(){
	int result = fibonacci(64);
	return 0;
}
