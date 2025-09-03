package model;

import java.util.ArrayList;
import java.util.List;

public class RespositorioLibro {
    private ArrayList<Libro> Lista = new ArrayList<>();

    public RespositorioLibro(){

        Lista.add(new Libro("El Hobbit","J.R.R Tolkien",1937,"Drama","El Hobbit es una novela de J.R.R. Tolkien sobre Bilbo Bolsón, un hobbit que se une a una aventura para recuperar un tesoro robado por el dragón Smaug. En el viaje, descubre su valentía y vive grandes desafíos. Es el preludio de El Señor de los Anillos"));
        Lista.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1937, "Drama",
                "La historia de la familia Buendía en el mítico pueblo de Macondo, explorando temas como el amor, la soledad y el paso del tiempo."));

        Lista.add(new Libro("1984", "George Orwell", 1949, "Drama",
                "Una novela distópica que describe una sociedad totalitaria bajo la vigilancia constante del Gran Hermano."));

        Lista.add(new Libro("Fahrenheit 451", "Ray Bradbury", 1949, "Drama",
                "En un futuro donde los libros están prohibidos, un bombero comienza a cuestionar su rol y lucha por preservar el conocimiento."));

        Lista.add(new Libro("Orgullo y prejuicio", "Jane Austen", 1949, "Drama",
                "Una historia de amor y crítica social en la Inglaterra del siglo XIX, protagonizada por Elizabeth Bennet y el señor Darcy."));

        Lista.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1949, "Drama",
                "Las aventuras del caballero Don Quijote y su fiel escudero Sancho Panza, en una sátira de los libros de caballería."));

        Lista.add(new Libro("Los pilares de la Tierra", "Ken Follett", 1949, "Drama",
                "Una novela histórica que narra la construcción de una catedral en la Edad Media, entrelazando las vidas de nobles, clérigos y artesanos en tiempos turbulentos."));

        Lista.add(new Libro("El nombre de la rosa", "Umberto Eco", 1949, "Drama",
                "Un monje franciscano investiga una serie de asesinatos en una abadía medieval, en una historia que mezcla misterio, filosofía y religión."));

        Lista.add(new Libro("La ladrona de libros", "Markus Zusak", 1949, "Drama",
                "Durante la Segunda Guerra Mundial, una niña encuentra consuelo robando libros y compartiéndolos en medio del horror nazi. Narrada por la Muerte."));

        Lista.add(new Libro("El psicoanalista", "John Katzenbach", 1949, "Drama",
                "Un thriller psicológico donde un psicoanalista es amenazado por un misterioso enemigo que lo obliga a descubrir su identidad para sobrevivir."));

        Lista.add(new Libro("La carretera", "Cormac McCarthy", 1949, "Drama",
                "Un padre y su hijo recorren un mundo post-apocalíptico en busca de esperanza, enfrentando peligros y desolación en una historia profundamente humana."));



    }


    public Libro buscarPorTitulo(String titulo) {
        for (Libro libro : Lista) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null; // Si no se encuentra el libro
    }


    public List<Libro> obtenerLibros() {
        return Lista;
    }

}
