def concat(name: String) (age : String) (profession: String) : String = {
  name + " is " + age + " years old and is a " + profession
}

val curried : String => String = concat(_)("21")("Programmer")

curried("Alfred")