//let num = document.getElementById("fnum")
let num = document.querySelector("input#fnum")
let lista = document.getElementById("flista")
//let lista = document.querySelector("select#flista")
let ValList = document.getElementById("flista").size
//let res = document.getElementById("res")
let res = document.querySelector("div#res")
let valores=[]
let cont = 0
let subb = 0 
let soma = 0
//
function adicionar(){
    if(cont < ValList){
        if (isNumero(num.value) && !inLista(num.value, valores)) {
            valores.push(Number(num.value))
            let item = document.createElement("option")
            item.text = `valor ${num.value} adicionado.`
            lista.appendChild(item)
            res.innerHTML=""
            soma += valores[valores.length - 1]
            cont++
        } else {

            window.alert(`Numero Informado (${num.value}) inválido (Deve ser entre 0 e 100 e não pode ser repetido)`)
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
    if(cont < ValList){
        if (isNumero(num.value) && !inLista(num.value, valores)) {
            valores.push(Number(num.value))
            let item = document.createElement("option")
            item.text = `valor ${num.value} será retirado.`
            lista.appendChild(item)
            res.innerHTML=""
            subb = subb + valores[valores.length - 1]
            cont++
        } else {
            window.alert(`Numero Informado (${num.value}) inválido (Deve ser entre 0 e 100 e não pode ser repetido)`)
        } 
        num.value = ""
        num.focus()
    }
}
function finalizar(){
    window.alert(`Subb = `+subb)
    if (valores.length==0){
        window.alert("Adicione valores antes de finalizar")
    } else {
        let tot = valores.length
        let maior = valores[0]
        let menor = valores[0]
        let final = 0
        let media = 0
		let pos = 0
        for (pos in valores){
            if (valores[pos]> maior)
                maior = valores[pos]
            if (valores[pos] < menor)
                menor = valores[pos] 

        }
        final = soma - subb
        window.alert(`Final = `+final)
        media = final/tot
        if(final < 0){
            res.innerHTML = ""
            res.innerHTML+=`<p>Ao todo, temos ${tot} elementos cadastrados</p>`
            res.innerHTML+=`<p>o maior valor informado foi  ${maior}</p>`
            res.innerHTML+=`<p>o menor valor informado foi  ${menor}</p>`
            res.innerHTML+=`<p>O valor total é negativo e não poderá ser mostrado ${final}</p>`
            res.innerHTML+=`<p>A Media dos valores   ${media}</p>`
        } else{
            res.innerHTML = ""
            res.innerHTML+=`<p>Ao todo, temos ${tot} elementos cadastrados</p>`
            res.innerHTML+=`<p>o maior valor informado foi  ${maior}</p>`
            res.innerHTML+=`<p>o menor valor informado foi  ${menor}</p>`
            res.innerHTML+=`<p>O valor total é ${final}</p>`
            res.innerHTML+=`<p>A Media dos valores   ${media}</p>`
        }
    }
 }