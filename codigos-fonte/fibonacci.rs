//Fibonacci para Rust

fn fibonacci(termos: usize){
    let mut a: i64 = 0;
    let mut b: i64 = 1;
    let mut ac: i64 = 0;
    for i in 0..termos{
        println!("{}", a);
        ac = a + b;
        a = b;
        b = ac;
    }
}

fn main(){
    fibonacci(64)
}
