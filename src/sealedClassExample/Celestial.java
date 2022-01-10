package sealedClassExample;

// As Classes seladas são uma classe que cria um modelo, que apenas
// as classes permitidas podem ser extendias
public sealed interface Celestial permits Planet, Star, Comet{

}