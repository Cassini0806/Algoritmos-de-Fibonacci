#Fibonacci para julia

function fibonacci(termos)
	a = 0 
	b = 1
	ac = 0
	for i in 0:termos-1
		println(a)
		ac = a + b
		a = b
		b = ac
	end
end

fibonacci(64)

