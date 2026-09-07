#Fibonacci para Python

def fibonacci(termos: int):
    valores = dict(a=0, b=1, ac=0)

    for idx in range(0, termos):
        print(valores['a'])
        valores['ac'] = valores['a'] + valores['b']
        valores['a'] = valores['b']
        valores['b'] = valores['ac']

fibonacci(64)
