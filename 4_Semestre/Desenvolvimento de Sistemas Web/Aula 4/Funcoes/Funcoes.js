function somar (num1, num2){
    return num1+num2;
}

function subtrair (num1, num2){
    return num1-num2;
}

function multiplicar (num1, num2){
    return num1*num2;
}

function dividir (num1, num2){
    if(num2!=0){
        return num1/num2;
    }
    document.write("Não existe divisao por 0");
}