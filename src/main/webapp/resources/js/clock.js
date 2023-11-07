const clock = document.getElementById('clock');

function runClock() {
    clock.innerHTML = new Date().toLocaleString();
}

runClock();
setInterval(runClock, 5000);