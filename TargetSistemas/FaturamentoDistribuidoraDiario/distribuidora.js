
const faturamentosMes =require('./faturamentos.json');
diaMenorFaturamento=0;
diaMaiorFaturamento=0;


console.log("\nFaturamentos Distribuidora\n")
console.log("Menor valor de faturamentode: R$ "+calcularMenorValor(faturamentosMes).toFixed(2)+"|\t Ocorreu no dia: "+diaMenorFaturamento);
console.log("Maior valor de faturamento: R$ "+calcularMaiorValor(faturamentosMes).toFixed(2)+"|\t Ocorreu no dia: "+diaMaiorFaturamento);
console.log("Numero de dias em que o faturamento é superior a média de "+calcularMedia(faturamentosMes).toFixed(2)+" foi de: "+calcularDiasSuperiorMedia(faturamentosMes)+" dias");





function calcularMenorValor( valores)
{
    let verificaValor=valores[0].faturamento;

    for(var x=0;x<valores.length;x++)
    {
        if(verificaValor>valores[x].faturamento&&valores[x].faturamento>0)
        {
            verificaValor=valores[x].faturamento;
            this.diaMenorFaturamento=valores[x].dia;
        }
    }
    return verificaValor;
}
function calcularMaiorValor(valores)
{
    let verificaValor=valores[0].faturamento;

    for(var x=0;x<valores.length;x++)
    { 
        if(verificaValor<valores[x].faturamento)
        {
            verificaValor=valores[x].faturamento
            diaMaiorFaturamento=valores[x].dia;

        }
    }
    return verificaValor;
}
function calcularMedia(valores)
{
    let verificaMedia=0;
    let contadorDiasFaturamento=0;
    
    for(var x=0;x<valores.length;x++)
    { 
        if(valores[x].faturamento>0)
        {
            verificaMedia=verificaMedia+valores[x].faturamento;
            contadorDiasFaturamento++;
        }
    }

    return (verificaMedia/contadorDiasFaturamento);
}

function calcularDiasSuperiorMedia(valores)
{
    let DiasSuperiorMedia=0;
    
    for(var x=0;x<valores.length;x++)
    { 
        if(valores[x].faturamento>0&&valores[x].faturamento>calcularMedia(valores))
        {
            DiasSuperiorMedia++;
        }
    }
    return DiasSuperiorMedia;
}