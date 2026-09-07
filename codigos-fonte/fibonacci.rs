//Fibonacci para Rust

struct elementos {
    a: i64, 
    b: i64, 
    ac: i64,
}

fn fibonacci(termos: usize){
    let mut valores = elementos {
        a: 0,
        b: 1,
        ac: 0,
    };
    for i in 0..termos{
        println!("{}", valores.a);
        valores.ac = valores.a + valores.b;
        valores.a = valores.b;
        valores.b = valores.ac;
    }
}

fn main(){
    fibonacci(64)
}
