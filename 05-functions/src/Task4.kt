/*
Написать функцию, которая проверяет email на корректность.
Корректным считается email если в нем присутствует символа @ и точка.
Проверить наличие символа в строке можно с помощью функции contains следующим образом: string.contains(‘@’),
где string – любая переменная типа String. Обратите внимание, что отдельные символы пишутся в одинарных кавычках,
тогда как строка пишется в двойных.

На вход email: String, на выходе Boolean
Например:
Если есть val text: String = “Forest”, тогда text.contains(‘e’) выдаст true, а !text.contains(‘e’)  выдаст false

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun main() {
    val email: String = readln().toString()
    val result: Boolean = checkEmail(email)

    println(result)
}

fun checkEmail(email: String): Boolean {

    val checking: Boolean = when {
            !email.contains('@') || !email.contains('.') -> false
        else -> true
    }
    return checking
}