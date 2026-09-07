//Fibonacci para JavaScript

function fibonacci(termos){
	
	const valores = {
		a: 0,
		b: 1,
		ac: 0
	};

	for (idx = 0; idx < termos; idx++){
		console.log(valores.a);
		valores.ac = valores.a + valores.b;
		valores.a = valores.b;
		valores.b = valores.ac;
	}
	return
}

fibonacci(64)
