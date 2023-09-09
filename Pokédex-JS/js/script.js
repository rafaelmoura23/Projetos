const listaPokemon = document.querySelector("#listaPokemon");
const botonesHeader = document.querySelectorAll(".btn-header");
let URL = "https://pokeapi.co/api/v2/pokemon/"; // url da API dos pokemons para mudar os pokemons basta adicionar um número até 151 após a última barra

// 151 PRIMEIROS POKEMONS | NOVA GERAÇÃO

//laço de repetição para gerar o link da url 151 vezes, adicionando 1 após a barra, para receber as informações de cada pokemon
for (let i = 1; i <= 151; i++) {
    fetch(URL + i) //concatena i a URL
        .then((response) => response.json())
        .then(data => mostrarPokemon(data))
}

function mostrarPokemon(poke) {  //criando os cards e especificando os valores puxados da API

    let tipos = poke.types.map((type) => `<p class="${type.type.name} tipo">${type.type.name}</p>`); //acessando os tipos dos pokemon {string de 1 ou 2}
    tipos = tipos.join(''); //join permite juntar todos os elementos de um arrai em uma string

    //se o Id tiver 1 digito adicione 00, se tiver 2 digitos adicione 0
    let pokeId = poke.id.toString();
    if (pokeId.length === 1) {
        pokeId = "00" + pokeId;
    } else if (pokeId.length === 2) {
        pokeId = "0" + pokeId;
    }

    const div = document.createElement("div");
    div.classList.add("pokemon");
    div.innerHTML = `
    <p class="pokemon-id-back">#${pokeId}</p> <!-- background com um número opaco -->
    <div class="pokemon-imagen">
        <img src="${poke.sprites.other["official-artwork"].front_default}"
            alt="${poke.name}">
    </div>
    <div class="pokemon-info">
        <div class="nombre-contenedor">
            <p class="pokemon-id">#${pokeId}</p>
            <h2 class="pokemon-nombre">${poke.name}</h2>
        </div>
        <div class="pokemon-tipos">
            ${tipos}
        </div>
        <div class="pokemon-stats">
            <p class="stat">${poke.height}m</p>
            <p class="stat">${poke.weight}kg</p>
        </div>
    </div>
      `;
    listaPokemon.append(div);
}

botonesHeader.forEach(boton => boton.addEventListener("click", (event) => {
    const botonId = event.currentTarget.id;

    listaPokemon.innerHTML = "";

    for (let i = 1; i <= 151; i++) {
        fetch(URL + i) //concatena i a URL
            .then((response) => response.json())
            .then(data => {

                if (botonId === "ver-todos") {
                    mostrarPokemon(data);
                } else {
                    const tipos = data.types.map(type => type.type.name);
                    if (tipos.some(tipo => tipos.includes(botonId))) {
                        mostrarPokemon(data);
                    }
                }

            })
    }
}))