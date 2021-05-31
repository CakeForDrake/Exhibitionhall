function open_new_user() {
  var id = "new_user";
  document.getElementById(id).classList.remove("closed");
}

function close_new_user() {
  var id = "new_user";
  document.getElementById(id).classList.add("closed");
}