fun main() {
   rates();
}
fun rates() {
    val age = 20;
    val lower = (220 - age) * 0.65;
    val higher = (220 - age) * 0.85;
    return println("Heart rate limits are $higher - $lower");

}
