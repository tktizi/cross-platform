document.getElementById('user-menu-button').addEventListener('click', function () {
    let dropdown = document.getElementById('dropdown-user');
    if (dropdown.classList.contains('hidden')) {
        dropdown.classList.remove('hidden');
    } else {
        dropdown.classList.add('hidden');
    }
});