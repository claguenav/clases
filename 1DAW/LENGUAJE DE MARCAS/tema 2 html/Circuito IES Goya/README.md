# Circuito IES Francisco de Goya

Abre esta carpeta en VS Code y muestra `index.html` con Live Preview. Puedes abrir la dirección de Live Preview en un navegador externo si el panel integrado da problemas con el audio o el vídeo.

## Construirlo paso a paso

Abre `GUIA.html` en el navegador o `GUIA.md` en VS Code. La guía parte de `inicio.html` y explica cómo construir `mi-circuito.html`. El archivo `index.html` es el ejemplo terminado.

## Contenido

```text
Circuito IES Goya/
├── index.html
├── README.md
├── audio/
│   └── presentacion.mp3
├── videos/
│   └── presentacion.mp4
├── imagenes/
│   ├── logo-goya.png
│   └── portada.jpg
├── subtitulos/
│   └── presentacion-es.vtt
├── textos/
│   └── transcripcion.txt
└── documentos/
    └── programa-circuito.pdf
```

## Organización del HTML

- `header`: logotipo, título y presentación del circuito.
- `nav`: enlaces directos a los apartados. Normalmente aparecen en una línea si hay espacio; en una ventana estrecha pueden pasar a otra.
- `main`: cinco secciones con título: presentación, circuito, vídeo de Fórmula 1, programa y preguntas frecuentes.
- `aside`: enlaces para ampliar información.
- `footer`: identificación del centro y la asignatura.

Hay un `hr` después del menú y otro al terminar `main`. Son separadores de contenido. La página no utiliza CSS ni JavaScript.

## Qué probar

1. Reproduce el audio y comprueba la transcripción.
2. Reproduce el vídeo: el MP4 ya contiene la narración. No hace falta iniciar el MP3; si reproduces ambos a la vez se escuchan mezclados.
3. Activa los subtítulos y abre el archivo VTT para comparar los tiempos con la narración.
4. En una copia del HTML, prueba `muted`, `loop` y otra imagen en `poster`, cambiando una cosa cada vez. `muted` y `loop` se desactivan retirando el atributo, no escribiendo `false`.
5. Reproduce el vídeo de YouTube y prueba su enlace exterior. El iframe utiliza `/embed/9RrpeaMWhWY`.
6. Consulta el PDF incrustado con `object` y prueba los enlaces para abrirlo y descargarlo.
7. Abre y cierra las preguntas con el ratón y con el teclado. La norma de los móviles comienza abierta por `open`, pero el usuario puede cerrarla.

## Recursos

El circuito es una creación para la actividad. La voz es sintética; la animación, la portada y los subtítulos se han generado para este proyecto. El logotipo lo ha facilitado el profesor. El PDF contiene un programa propuesto para el ejercicio.

El vídeo externo seleccionado es https://www.youtube.com/watch?v=9RrpeaMWhWY . Solo este reproductor y los enlaces externos necesitan Internet. Si YouTube bloquea la inserción, utiliza el enlace exterior.

Apuntes: https://marcas.cgarcher.dev/docs/unidades/02/contenidos/multimedia-interaccion/
