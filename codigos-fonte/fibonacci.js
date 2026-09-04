//Fibonacci para JavaScript

function fibonacci(termos){
	a = 0;
	b = 1;
	ac = 0;
	for (idx = 0; idx < termos; idx++){
		console.log(a);
		ac = a + b;
		a = b;
		b = ac;
	}
	return
}

fibonacci(64)
