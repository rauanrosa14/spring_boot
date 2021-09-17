// Call the dataTables jQuery plugin
$(document).ready(function() {
  carregarUsuario();
  $('#dataTable').DataTable();
});

async function carregarUsuario(){
    const request = await fetch('usuarios', {
            nethod: 'GET',
            headers: {
                'Accept' :  'application/json',
                'Content-Type' : 'application/json'
            }
    });
    const usuarios = await request.json();

    let listadoHtml = '';
    let usuarioHTML = '';
    for(let usuario of usuarios){

        usuarioHTML =  '<tr><td>'+usuario.id+'</td><td>'+usuario.nome+'</td><td>'+usuario.email+'</td><td>'+usuario.telefone+'</td><td>'+usuario.descricao+'</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';
        console.log(usuarioHTML);
        listadoHtml += usuarioHTML;
    }

    console.log(usuarios);

    document.querySelector("#dataTable tbody").outerHTML = listadoHtml;
}

