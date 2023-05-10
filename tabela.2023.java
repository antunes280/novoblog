const carrosEsquerda = document.querySelectorAll('.carro-lado-esquerdo');
const carrosDireita = document.querySelectorAll('.carro-lado-direito');

for (let i = 0; i < carrosEsquerda.length; i++) {
  carrosEsquerda[i].style.opacity = 0;
  carrosDireita[i].style.opacity = 0;
}

let contador = 0;

function mostrarCarros() {
  if (contador >= carrosEsquerda.length) {
    clearInterval(intervalo);
    return;
  }

  carrosEsquerda[contador].style.opacity = 1;
  carrosDireita[contador].style.opacity = 1;

  contador++;
}

const intervalo = setInterval(mostrarCarros, 1000);
