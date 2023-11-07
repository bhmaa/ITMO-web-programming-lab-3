function changeR(rlink, value) {
    document.getElementById('form:r').value = value;
    let links = document.getElementById('r-links').getElementsByClassName('r-checked');
    for (let i = 0; i < links.length; i++) {
        links[i].classList.remove('r-checked');
    }
    rlink.classList.add('r-checked');
    drawGraph(value);
}