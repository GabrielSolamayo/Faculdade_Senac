let num = document.getElementById("fnum")
//let num = document.querySelector("input#fnum")
let lista = document.getElementById("flista")
let VaList = document.getElementById("flista").size
//let lista = document.querySelector("select#flista")
let res = document.getElementById("res")
//let res = document.querySelector("div#res")
let valores=[]
let cont = 0
let soma = 0
let sub = 0
let final = 0

//
function adicionar(){
    if(cont < VaList){
        if (isNumero(num.value) && !inLista(num.value, valores)) {
            valores.push(Number(num.value))
            let item = document.createElement("option")
            item.text = `valor ${num.value} adicionado.`
            lista.appendChild(item)
            res.innerHTML=""
            cont++
            soma += valores[valores.length - 1]
        } else {
            window.alert(`Numero Informado (${num.value}) invalido (Deve ser entre 0 e 100 e nao pode ser repetido)`)
        } 
        num.value = ""
        num.focus()
    }   
 }
 function isNumero(n){
    if (Number(n) >=1 &&  Number(n)<=100){
        return  true
    } else{
        return false
    }
}
function inLista(n, l){
    if (l.indexOf(Number(n)) != -1){
        return true 
    } else {
        return false
    }
}
function subtrair(){
    if(cont < VaList){
        if (isNumero(num.value) && !inLista(num.value, valores)) {
        valores.push(Number(num.value))
        let item = document.createElement("option")
        item.text = `valor ${num.value} será retirado.`
        lista.appendChild(item)
        res.innerHTML=""
        cont++
        sub += valores[valores.length - 1]
        } else {
            window.alert(`Numero Informado (${num.value}) inválido (Deve ser entre 0 e 100 e não pode ser repetido)`)
        } 
        num.value = ""
        num.focus()
    }
}
function finalizar(){
    if (valores.length==0){
        window.alert("Adicione valores antes de finalizar")
    } else {
        let tot = valores.length
        let maior = valores[0]
        let menor = valores[0]
        let media = 0
		let pos = 0
        let q25 = 0
        let q50 = 0
        let q75 = 0
        let q100 = 0
        for (pos in valores){
            if (valores[pos]> maior)
                maior = valores[pos]
            if (valores[pos] < menor)
                menor = valores[pos] 
            if(valores[pos] <= 25){
                q25++
            }else if(valores[pos] >25 && valores[pos] <=50){
                q50++
            }else if(valores[pos] > 50 && valores[pos] <= 75){
                q75++
            }else{
                q100++
            }
        }
        final = (soma - sub)
        media = final/tot
        res.innerHTML = ""
        res.innerHTML+=`<p>Ao todo, temos ${tot} elementos cadastrados</p>`
        res.innerHTML+=`<p>o maior valor informado foi  ${maior}</p>`
        res.innerHTML+=`<p>o menor valor informado foi  ${menor}</p>`
        res.innerHTML+=`<p>O valor final é ${final}</p>`
        res.innerHTML+=`<p>A Média dos valore   ${media}</p>`
        res.innerHTML+=`<p>Entre o quartil 1 é tem ${q25} numeros (entre 0% e 25%)</p>`
        res.innerHTML+=`<p>Entre o quartil 2 é tem ${q50} numeros (entre 25% e 50%)</p>`
        res.innerHTML+=`<p>Entre o quartil 3 é tem ${q75} numeros (entre 50% e 75%)</p>`
        res.innerHTML+=`<p>Entre o quartil 4 é tem ${q100} numeros (entre 75% e 100%)</p>`

    }
    
 }