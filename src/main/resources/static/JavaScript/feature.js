const togglePassword = document.querySelector('#togglePassword');
const password = document.querySelector('#pass');

togglePassword.addEventListener('click', function (e) {
   // toggle the type attribute
   const type = password.getAttribute('type') === 'password' ? 'text' : 'password';
   password.setAttribute('type', type);
   // toggle the eye slash icon
   this.classList.toggle('fa-eye-slash');
});

const toggleRePassword = document.querySelector('#toggleRePassword');
const repassword = document.querySelector('#repassword');

toggleRePassword.addEventListener('click', function (e) {
   // toggle the type attribute
 const type = repassword.getAttribute('type') === 'password' ? 'text' : 'password';
   repassword.setAttribute('type', type);
   // toggle the eye slash icon
   this.classList.toggle('fa-eye-slash');
});