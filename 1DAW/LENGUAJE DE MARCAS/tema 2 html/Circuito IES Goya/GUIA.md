# Circuito IES Goya paso a paso

Construiremos una página multimedia con HTML, sin CSS ni JavaScript. Trabaja en mi-circuito.html y utiliza index.html como referencia final.

## 1 Preparar la carpeta

Descomprime el ZIP y abre la carpeta Circuito IES Goya en VS Code. Los recursos ya están preparados. index.html contiene el ejemplo terminado: déjalo para comparar al final.

Abre inicio.html y guarda una copia en esta misma carpeta con el nombre mi-circuito.html. Así las rutas de audio, vídeo, imágenes y documentos funcionarán sin modificarlas. Abre mi-circuito.html con Live Preview.

```text
Circuito IES Goya/
├── index.html                 Ejemplo terminado
├── inicio.html                Plantilla para empezar
├── mi-circuito.html           Tu página de trabajo
├── imagenes/
├── audio/
├── videos/
├── subtitulos/
├── textos/
└── documentos/
```

Comprueba: al principio solo se verá una página vacía y el título de la pestaña. Guarda cada cambio y recarga si no aparece.

## 2 Construir la estructura

Sustituye el comentario dentro de body por este bloque. Mantén el resto de la plantilla. Más adelante añadiremos los apartados dentro de main.

```html
<header>
    <img src="imagenes/logo-goya.png" alt="Logotipo del IES Francisco de Goya" width="150">
    <h1>Circuito IES Francisco de Goya</h1>
    <p>Molina de Segura · Una vuelta por el circuito del Goya.</p>
</header>

<nav>
    <a href="#presentacion">Presentación</a> |
    <a href="#circuito">Nuestro circuito</a> |
    <a href="#formula-1">Fórmula 1</a> |
    <a href="#programa">Programa</a> |
    <a href="#preguntas">Preguntas frecuentes</a>
</nav>

<hr>

<main>
    <!-- Añadiremos aquí las cinco secciones y el aside. -->
</main>

<hr>

<footer>
    <p><small>IES Francisco de Goya · Lenguajes de Marcas.</small></p>
</footer>
```

header presenta la página; nav agrupa los enlaces; main contiene el contenido principal; footer la cierra. Los enlaces del menú van directamente dentro de nav, sin CSS. Si hay poco espacio, pueden pasar a otra línea.

Los dos hr separan la navegación del contenido y el contenido del pie. El menú todavía no lleva a ningún apartado: faltan sus identificadores. No crees otro main al añadir los ejemplos.

## 3 Añadir la presentación en audio

Dentro de main, antes de su cierre, añade esta primera sección:

```html
<section id="presentacion">
    <h2>Presentación del circuito</h2>
    <p>Escucha la presentación antes de comenzar la vuelta.</p>

    <!-- controls muestra los controles que proporciona el navegador. -->
    <audio controls preload="metadata">
        <source src="audio/presentacion.mp3" type="audio/mpeg">
        Tu navegador no admite el elemento de audio.
    </audio>

    <p><a href="audio/presentacion.mp3">Abrir el audio</a></p>

    <h3>Transcripción del audio</h3>
    <p>Bienvenidos al circuito del IES Francisco de Goya.
        Estamos en Molina de Segura. Vamos a recorrer su trazado.
        Conoceremos la recta de salida, las curvas y la zona de boxes.</p>
</section>
```

section agrupa el tema y h2 lo identifica. El id presentacion coincide con href="#presentacion" del menú. audio incorpora el reproductor, controls muestra sus botones y source señala el archivo. type informa de su formato; preload="metadata" sugiere cargar información inicial.

Comprueba: pulsa Presentación en el menú, reproduce el audio y compara lo que escuchas con la transcripción. Quita controls un momento y observa la diferencia; vuelve a ponerlo. El enlace exterior permite abrir el MP3 aunque falle el reproductor.

## 4 Incorporar el vídeo y su portada

Después de la sección del audio y todavía dentro de main, añade este bloque. Empezaremos sin la pista de subtítulos:

```html
<section id="circuito">
    <h2>Una vuelta a nuestro circuito</h2>
    <p>Sigue el punto rojo para localizar la recta de salida,
        las curvas y los boxes del circuito del Goya.</p>

    <figure>
        <!-- poster pertenece a video, no a source. -->
        <video controls width="640" preload="metadata" poster="imagenes/portada.jpg">
            <source src="videos/presentacion.mp4" type="video/mp4">
        </video>
        <figcaption>Una vuelta por el circuito del IES Francisco de Goya.</figcaption>
    </figure>

    <p><a href="videos/presentacion.mp4">Abrir el vídeo</a></p>
    <p><a href="textos/transcripcion.txt">Leer la transcripción y descripción del vídeo</a></p>
    <p><a href="subtitulos/presentacion-es.vtt" download>Descargar los subtítulos</a></p>
</section>
```

video reproduce el MP4. controls muestra el reproductor, width fija su ancho y poster señala la portada. figure reúne el vídeo y su explicación; figcaption es el pie visible.

El MP4 ya contiene la narración. No necesitas iniciar el MP3 a la vez. Los reproductores son independientes y sus sonidos pueden mezclarse.

Comprueba: reproduce el vídeo, activa su volumen y utiliza el enlace para abrirlo aparte. Si el panel de VS Code da problemas, abre la dirección de Live Preview en un navegador externo.

## 5 Conectar los subtítulos

Dentro de video, después de source y antes del texto alternativo, añade track:

```html
<track src="subtitulos/presentacion-es.vtt"
       kind="captions"
       srclang="es"
       label="Español"
       default>
```

Abre subtitulos/presentacion-es.vtt. Su contenido es:

```text
WEBVTT

1
00:00:00.000 --> 00:00:03.653
Bienvenidos al circuito del IES Francisco de Goya.

2
00:00:03.653 --> 00:00:08.271
Estamos en Molina de Segura. Vamos a recorrer su trazado.

3
00:00:08.271 --> 00:00:12.814
Conoceremos la recta de salida, las curvas y la zona de boxes.
```

WEBVTT identifica el formato. Cada intervalo contiene inicio, flecha --> y final; debajo aparece el texto. Una línea en blanco separa los bloques. Los números son identificadores opcionales. Se guarda como .vtt en UTF-8.

kind="captions" identifica diálogo y sonidos relevantes; srclang indica el idioma, label nombra la pista y default propone mostrarla inicialmente. El usuario puede seleccionarla desde los controles.

Comprueba: reproduce el vídeo desde Live Preview y activa la pista Español. La transcripción de textos/transcripcion.txt permite leer el contenido completo; el VTT lo muestra sincronizado. Ninguno genera voz.

## 6 Incrustar el vídeo de YouTube

Añade la sección siguiente después de la del circuito:

```html
<section id="formula-1">
    <h2>Conoce la Fórmula 1</h2>
    <p>Un vídeo de Fórmula 1 para inspirarnos antes de entrar en pista.</p>

    <!-- iframe carga el reproductor externo; no es un archivo MP4. -->
    <iframe src="https://www.youtube.com/embed/9RrpeaMWhWY" title="Vídeo de Fórmula 1" width="640" height="360"
        loading="lazy" referrerpolicy="strict-origin-when-cross-origin" allow="fullscreen; picture-in-picture"
        allowfullscreen>
    </iframe>
    <p><a href="https://www.youtube.com/watch?v=9RrpeaMWhWY">Ver el vídeo en YouTube</a></p>
</section>
```

iframe carga la página del reproductor de YouTube. title describe su contenido; width y height reservan su tamaño. loading="lazy" permite aplazar su carga. Conservamos la política de referencia y los permisos del reproductor.

Comprueba: con conexión a Internet, pulsa reproducir. Si la inserción está bloqueada, prueba el enlace exterior. La dirección de src utiliza youtube.com/embed/; un enlace youtu.be no es la dirección de inserción. Los subtítulos de YouTube se gestionan desde su reproductor, sin añadir track al iframe.

## 7 Mostrar el programa en PDF

Añade otra sección dentro de main:

```html
<section id="programa">
    <h2>Programa del circuito</h2>
    <p>Consulta los horarios y las normas de la visita.</p>

    <!-- object incorpora el PDF; el contenido interior es una alternativa. -->
    <object data="documentos/programa-circuito.pdf"
            type="application/pdf" width="640" height="450">
        <p>No se puede mostrar el PDF.
            <a href="documentos/programa-circuito.pdf">Abrir el programa</a>.</p>
    </object>

    <p><a href="documentos/programa-circuito.pdf">Abrir el programa en PDF</a></p>
    <p><a href="documentos/programa-circuito.pdf" download>Descargar el programa</a></p>
</section>
```

object incorpora el documento. data es la ruta, type indica PDF y las dimensiones corresponden al visor. El contenido entre las etiquetas ofrece una alternativa si el recurso no se puede representar.

Los enlaces fuera de object están siempre disponibles. Sin download se solicita abrir el archivo; con download se solicita descargarlo.

Comprueba: consulta el programa dentro de la página, ábrelo aparte y descárgalo. El comportamiento del visor depende del navegador. El archivo ya está incluido en documentos/programa-circuito.pdf.

## 8 Crear las preguntas frecuentes

Añade esta sección después del programa:

```html
<section id="preguntas">
    <h2>Preguntas frecuentes</h2>

    <details>
        <summary>¿Hay que reservar?</summary>
        <p>Sí, las plazas son limitadas. Consulta la disponibilidad antes de venir.</p>
    </details>

    <!-- open establece el estado inicial; el usuario puede cerrar la respuesta. -->
    <details open>
        <summary>¿Puedo llevar el móvil al circuito?</summary>
        <p>No está permitido introducir teléfonos móviles en el circuito,
            ni siquiera para consultar los tiempos de vuelta.</p>
    </details>

    <details>
        <summary>¿Necesito conocer la Fórmula 1 para participar?</summary>
        <p>No. Puedes empezar con el vídeo y preguntar tus dudas durante la presentación.</p>
    </details>

    <details>
        <summary>¿Dónde está el circuito?</summary>
        <p>En nuestra web del IES Francisco de Goya, en Molina de Segura.
            ¡Entra en el vídeo y comienza la vuelta!</p>
    </details>
</section>
```

details agrupa cada desplegable y summary es el texto que se pulsa para abrirlo. La pregunta de los móviles incluye open: empieza abierta, pero se puede cerrar. No queda fija.

Comprueba: abre las preguntas con el ratón y después con Tab y Enter o Espacio. Retira open de la norma de los móviles, recarga y observa el cambio. open="false" también activa el estado abierto; para desactivarlo se retira el atributo.

## 9 Añadir los recursos de consulta

Antes del cierre de main y después de las cinco secciones, incorpora el aside:

```html
<aside>
    <h2>Para ampliar</h2>
    <ul>
        <li><a href="https://www.formula1.com/">Web oficial de Fórmula 1</a></li>
        <li><a href="https://marcas.cgarcher.dev/docs/unidades/02/contenidos/multimedia-interaccion/">Apuntes de
                contenido incrustado y multimedia</a></li>
    </ul>
</aside>
```

aside contiene información complementaria: el contenido de la página se entiende sin esos enlaces. Su función no obliga a colocarlo en una columna lateral. Aquí se verá debajo.

## 10 Probar y comparar

Guarda mi-circuito.html y compáralo con index.html. Las diferencias de espacios o saltos del archivo no son un problema si el contenido y el anidamiento son correctos.

- Prueba los cinco enlaces del menú. Cada href con # debe coincidir con un id único.
- Reproduce audio y vídeo por separado; comprueba sonido, portada y subtítulos.
- Abre y descarga el PDF.
- Comprueba que la pregunta de los móviles comienza abierta.
- Recorre los enlaces y preguntas con el teclado.
- Valida el documento completo con Nu HTML Checker: https://validator.w3.org/nu/#textarea.

Si quieres seguir experimentando, añade muted al vídeo y reprodúcelo; después retíralo. Prueba loop y avanza hasta el final. Cambia poster por una imagen de la carpeta. Modifica solo un atributo cada vez y restaura el ejemplo al terminar.

source ofrece alternativas del mismo contenido, no una lista de reproducción. controls, muted, loop y open son atributos booleanos. Las instrucciones de dibujo y los diálogos programados quedan para otra práctica.

