//Fibonacci para Go

package main

import "fmt"

type elementos struct {
	a int
	b int
	ac int
}

func fibonacci(termos int) {
	valores := elementos{a: 0, b: 1, ac: 0}
	for i := 0; i < termos; i++ {
		fmt.Println(valores.a)
		valores.ac = valores.a + valores.b
		valores.a = valores.b
		valores.b = valores.ac
	}
	return
}

func main() {
	fibonacci(64)
}
