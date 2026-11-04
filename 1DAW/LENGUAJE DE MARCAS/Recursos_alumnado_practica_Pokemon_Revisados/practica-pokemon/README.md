# Práctica de clase individual

**Trabajo individual.**

Realiza la práctica siguiendo el enunciado. Trabaja con HTML, sin CSS ni JavaScript, y utiliza los recursos locales facilitados.

## Material de consulta permitido

Puedes consultar este README y estas webs:

- [Apuntes de clase](https://marcas.cgarcher.dev/docs/unidades/02/)
- [MDN Web Docs](https://developer.mozilla.org/es/docs/Web/HTML)
- [mclibre](https://www.mclibre.org/consultar/htmlcss/)

Puedes usar https://httpbin.org/post para comprobar el envío POST. También se permite [Netlify](https://app.netlify.com/) únicamente para desplegar la web con tu cuenta de clase. No se permite consultar ni reutilizar ejercicios previos, propios o de compañeros. Tampoco otras webs, buscadores ni herramientas de IA. Que una web esté enlazada desde los apuntes no la convierte en material permitido.

Las cuatro capturas muestran un ejemplo con menú repetido. También es válida la opción de un menú en index.html que cargue las páginas en un marco. Orientan sobre el contenido y la organización. Puedes elegir otros dos de los tres Pokémon facilitados. No se exige copiar sus medidas, salvo las dimensiones del marco indicadas en el enunciado. Si eliges el marco, puede tener barras de desplazamiento. Trabaja con HTML, sin CSS ni JavaScript.

Crea index.html, paginas/pokemon.html, paginas/horario.html y paginas/inscripcion.html. El ZIP incluye también ENUNCIADO.pdf y LICENCIA-imagenes.txt. Los HTML y respuestas.txt los creas tú; no se incluyen resueltos. La carpeta capturas está vacía para guardar tu prueba de envío.

## Desactivar Copilot

1. Abre Extensiones con **Ctrl + Mayús + X**.
2. Busca **GitHub Copilot**.
3. Pulsa su engranaje y selecciona **Deshabilitar**.
4. Repite con **GitHub Copilot Chat**, si aparece.

Las extensiones de IA deben permanecer desactivadas durante la práctica.

## Estructura de un documento

```html
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Título de la pestaña</title>
</head>
<body>
    <!-- Contenido de la página -->
</body>
</html>
```

Los atributos se escriben en la etiqueta de apertura. Los valores suelen ir entre comillas. `id` identifica un elemento y no debe repetirse en el mismo documento.

## Elementos y semántica

| Elemento | Significado |
| --- | --- |
| `h1`–`h6` | Encabezados con distintos niveles. |
| `p` | Párrafo. |
| `header` | Cabecera de la página o de un contenido. |
| `nav` | Grupo de enlaces de navegación. |
| `main` | Contenido principal del documento. Utiliza un único `main`. |
| `section` | Apartado temático, normalmente con encabezado. |
| `article` | Contenido que puede entenderse de manera independiente. |
| `aside` | Información complementaria relacionada con el contenido. |
| `footer` | Pie de la página o de un contenido. |
| `figure` / `figcaption` | Contenido con un pie explicativo. |
| `strong` / `em` | Importancia / énfasis. |
| `small` | Anotación secundaria, como copyright o información legal. |
| `abbr` | Abreviatura; `title` puede indicar su significado. |
| `time` | Fecha u hora; `datetime` aporta un formato interpretable. |
| `mark` | Texto destacado por su relevancia en el contexto. |
| `br` | Salto de línea dentro del contenido. |
| `hr` | Separación temática. |
| `div` / `span` | Agrupaciones genéricas, sin una función semántica específica. |

Un `article` o una `section` pueden tener su propio `header` y `footer`, además de los de la página. La cabecera introduce ese contenido (título, tipo o fecha); el pie aporta datos sobre él (autoría o fuente). No son obligatorios en todos los apartados. Pertenecen al artículo o sección que los contiene y no sustituyen a la cabecera y al pie generales. Elige las etiquetas por su significado; la apariencia se trabaja con CSS.

## Enlaces y rutas

```html
<a href="documento.html">Abrir documento</a>
<a href="#apartado">Ir a un apartado</a>
<a href="documento.html#apartado">Ir a un apartado de otro documento</a>
<a href="https://example.org" target="_blank" rel="noopener">Web externa</a>
<a href="mailto:contacto@example.org">Correo</a>
<a href="tel:+34900000000">Teléfono</a>
```

`href="#apartado"` necesita un elemento con `id="apartado"`. Sin `target`, el enlace se abre normalmente en el mismo contexto de navegación (`_self`).

| Inicio de una ruta | Desde dónde se resuelve |
| --- | --- |
| `archivo.html` | Carpeta del documento actual. |
| `./archivo.html` | Carpeta del documento actual. |
| `../archivo.html` | Carpeta superior. |
| `carpeta/archivo.html` | Subcarpeta del documento actual. |
| `/carpeta/archivo.html` | Raíz del sitio servido. |

Las rutas de enlaces, imágenes y formularios se resuelven desde el documento que las contiene, también cuando está dentro de un `iframe`. En HTML se utiliza `/` para separar carpetas. Respeta los nombres, extensiones y mayúsculas.

## Imágenes

```html
<figure>
    <img src="recurso.png" alt="Descripción de la imagen" width="240">
    <figcaption>Pie de la imagen.</figcaption>
</figure>
```

`src` indica la ruta. `alt` proporciona una alternativa al contenido de la imagen. `width` y `height` permiten indicar dimensiones en píxeles.

## Listas

| Elemento o atributo | Función |
| --- | --- |
| `ul` | Lista sin orden significativo. |
| `ol` | Lista con orden significativo. |
| `li` | Elemento de una lista. |
| `type` de `ol` | Numeración `1`, `A`, `a`, `I` o `i`. |
| `start` de `ol` | Valor inicial de la numeración. |
| `reversed` de `ol` | Numeración descendente. |
| `value` de `li` dentro de `ol` | Cambia el número de ese elemento y continúa desde él. |
| `dl`, `dt`, `dd` | Lista de términos o nombres y sus descripciones. |

```html
<ol type="A" start="5">
    <li>Primer elemento</li>
    <li value="8">Otro elemento</li>
</ol>
```

## Tablas

| Elemento o atributo | Función |
| --- | --- |
| `table` | Tabla de datos. |
| `caption` | Título de la tabla. |
| `thead`, `tbody`, `tfoot` | Grupos de filas. |
| `tr` | Fila. |
| `th` | Celda de encabezado. |
| `td` | Celda de datos. |
| `scope="col"` / `scope="row"` | Relaciona un encabezado con su columna o fila. |
| `colspan` / `rowspan` | Número de columnas o filas que ocupa una celda. |

```html
<table>
    <caption>Datos de ejemplo</caption>
    <thead>
        <tr><th scope="col">Concepto</th><th scope="col">Cantidad</th></tr>
    </thead>
    <tbody>
        <tr><td>Material</td><td>8</td></tr>
    </tbody>
</table>
```

## Formularios

```html
<form action="destino.html" method="get">
    <p><label for="dato">Texto</label>
        <input id="dato" name="dato" type="text"></p>
    <button type="submit">Enviar</button>
</form>
```

| Elemento o atributo | Función |
| --- | --- |
| `form` | Agrupa los controles del formulario. No se anida dentro de otro `form`. |
| `action` | Destino del envío. |
| `method="get"` | Añade los datos a la URL. |
| `method="post"` | Envía los datos en el cuerpo de la petición. |
| `label` y `for` | Etiqueta asociada al `id` del control. También puede contenerlo directamente. |
| `name` | Nombre del dato enviado. |
| `value` | Valor del control o de una opción. |
| `fieldset` / `legend` | Grupo de campos y título del grupo. |
| `textarea` | Texto de varias líneas. El valor inicial va entre sus etiquetas. |
| `select` / `option` | Lista de opciones. |
| `optgroup` | Grupo de opciones; `label` indica su nombre. |
| `datalist` | Sugerencias para un campo; `list` apunta al `id` del `datalist`. |

Tipos de `input`: `text`, `email`, `password`, `tel`, `url`, `search`, `number`, `date`, `time`, `month`, `week`, `datetime-local`, `radio`, `checkbox`, `range`, `color`, `file` y `hidden`.

| Atributo | Función |
| --- | --- |
| `required` | Hace obligatorio el dato en los controles compatibles. |
| `minlength`, `maxlength` | Longitud del texto. |
| `min`, `max`, `step` | Límites e incremento de valores numéricos o temporales compatibles. |
| `pattern` | Patrón que debe cumplir el valor completo en tipos de texto compatibles. |
| `placeholder` | Pista dentro del campo. No sustituye a `label`. |
| `autocomplete` | Ayuda al navegador a identificar el dato: `name`, `email`, `tel`, etc. |
| `checked` | Selección inicial de `radio` o `checkbox`. |
| `selected` | Selección inicial de una `option`. |
| `multiple` | Varios valores en controles compatibles. |
| `readonly` | Impide editar; el dato puede enviarse. |
| `disabled` | Desactiva y excluye el dato del envío. |
| `accept` | Sugiere tipos de archivo. No comprueba su contenido. |

Los `radio` del mismo formulario con el mismo `name` forman un grupo de elección única. Los `checkbox` permiten elecciones independientes; sin marcar, no se envían. `required` en un `checkbox` obliga a marcar esa casilla concreta.

En un `select` de una sola elección, una primera opción con `value=""`, junto con `required`, obliga a elegir una opción con valor. `multiple` permite elegir varias opciones. `datalist` permite escribir valores que no estén entre las sugerencias.

`checked`, `selected`, `required` y `disabled` son booleanos: escribir `="false"` no los desactiva. Para desactivarlos se elimina el atributo.

Botones: `submit` solicita el envío; `reset` recupera los valores iniciales; `button` no envía por sí solo. También existe `<input type="submit" value="Enviar">`.

En las expresiones regulares, `[A-Z]` representa una letra del intervalo A–Z; `[0-9]`, una cifra; `{4}`, cuatro repeticiones; `{2,6}`, entre dos y seis; `+`, una o más; `*`, cero o más; `?`, un elemento opcional. `pattern` no hace obligatorio un campo ni se escribe entre barras `/`.

HTML no guarda los datos por sí solo. POST no cifra el envío; la protección del transporte corresponde a HTTPS. Las restricciones del navegador no sustituyen las comprobaciones del servidor.

## Multimedia e interacción

```html
<video controls width="480" poster="portada.jpg">
    <source src="recurso.mp4" type="video/mp4">
    Tu navegador no admite este vídeo.
</video>

<audio controls>
    <source src="recurso.mp3" type="audio/mpeg">
</audio>

<details open>
    <summary>Título de la pregunta</summary>
    <p>Contenido de la respuesta.</p>
</details>
```

`controls` muestra los controles del reproductor. `poster` pertenece a `video`. `source` indica el recurso y su tipo. `track` puede enlazar subtítulos en formato WebVTT. `open` deja un `details` abierto inicialmente, pero permite cerrarlo.

```html
<a href="documento.html" target="visor">Abrir documento</a>
<iframe src="documento.html" name="visor"
        title="Descripción del contenido" width="600" height="350"></iframe>
```

`iframe` muestra otro documento. `src` establece el inicial; `name` permite dirigir enlaces al marco mediante `target`. El tamaño no se adapta automáticamente al contenido. Si usas esta opción para la web, dirige al marco los enlaces a Pokémon, Horario e Inscripción. Inicio vuelve a index.html fuera del marco, para evitar cargar la página principal dentro de sí misma. Un `id` por sí solo no sustituye a `name` para dirigir esos enlaces.

## Indicadores

- `meter`: una medida en un intervalo conocido; utiliza `min`, `max` y `value`.
- `progress`: avance de una tarea; utiliza `max` y `value`. Sin `value`, el avance es indeterminado.
- `output`: un resultado. No realiza cálculos automáticamente.

## Revisión y entrega

Guarda los archivos antes de probarlos. Comprueba las rutas con Live Preview, los enlaces, las imágenes y los controles. Revisa las etiquetas de cierre, la jerarquía de encabezados y los identificadores repetidos.

En respuestas.txt escribe la diferencia entre GET y POST y la URL publicada en Netlify. Guarda la prueba del POST en capturas/post.png.

Para publicar, copia index.html y las carpetas paginas, imagenes y videos a una carpeta aparte y súbela a Netlify. index.html debe quedar en su raíz. No publiques respuestas.txt ni capturas. Comprueba las cuatro páginas y sus recursos desde la URL pública; el formulario seguirá enviando a httpbin.

Entrega la carpeta de trabajo completa en Apellidos_Nombre_HTML.zip, incluidos respuestas.txt y capturas/post.png. La web debe seguir funcionando al descomprimirla en otra ubicación. La publicación en Netlify vale 0,25 puntos; el total de la práctica es 10.
