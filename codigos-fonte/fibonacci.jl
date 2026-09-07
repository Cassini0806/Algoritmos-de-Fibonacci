#Fibonacci para Julia

mutable struct elementos 
	a::Int64
	b::Int64
	ac::Int64
end

function fibonacci(termos)
	valores = elementos(0,1,0)
	
	for i in 0:termos-1
		println(valores.a)
		valores.ac = valores.a + valores.b
		valores.a = valores.b
		valores.b = valores.ac
	end
end

fibonacci(64)

