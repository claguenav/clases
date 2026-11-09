

---

## Ejercicio 2

### c) La contraseña tendrá al menos ocho caracteres y será obligatoria. Usa `autocomplete="new-password"`.

* **¿Cuál usarías para iniciar sesión?**
Para iniciar sesión se utiliza `autocomplete="current-password"`.


---

### d) Añade Enviar y Restaurar. Modifica el resumen y pulsa Restaurar. ¿Qué ocurre?

* **¿Qué ocurre?** Al pulsar el botón de restaurar (`type="reset"`), todos los campos del formulario vuelven automáticamente al estado o valores que tenían cuando se cargó la página por última vez .


---

### e) Usa una contraseña inventada: GET la muestra en la URL. ¿Qué oculta `password`? ¿Cifra los datos?

* **¿Qué oculta y cifra?** El tipo `input type="password"` **solo oculta visualmente** los caracteres en pantalla mostrando asteriscos o puntos para que la gente que esté al lado no los vea. No cifra los datos en ningún momento; si envías el formulario por el método `GET`, la contraseña viajará en texto plano y completamente visible dentro de la propia URL.

---

## Ejercicio 3

### d) Envía varias aficiones. Después desmárcalas y vuelve a enviar. Compara la URL.

* **Explicación:** Cuando marcas varias opciones y envías con `GET`, aparecen en la URL separadas por ampersands. Si se desmarcan todas  y se vuelve a enviar, el parámetro `aficiones` desaparece de la URL, ya que los checkboxes desmarcados no se envían al servidor.

---

### e) Prueba `checked="false"`. ¿Deja la casilla sin marcar? ¿Qué pasa si pones `required` en dos casillas?

1. **`checked="false"`:** La casilla se queda marcada.
2. **`required` en dos casillas:** Provoca un conflicto de validación en el navegador: exigirá que  ambas  casillas estén marcadas de forma simultánea para poder enviar el formulario.

---

## Ejercicio 4

### Añade un campo con `datalist` y las mismas poblaciones. Prueba a escribir "Cartagena" en los dos controles. ¿Cuál lo permite?

* **Respuesta:** El control basado en `<input type="text">` con un `<datalist>` sí permite escribir y enviar "Cartagena", ya que actúa como un campo de texto con sugerencias.


---

## Ejercicio 5

### Modifica los campos y prueba cada botón. ¿Cuál envía? ¿Cuál recupera los valores iniciales? ¿Qué hace Ayuda?

* **¿Cuál envía?** El botón de tipo submit (`<input type="submit">` o `<button type="submit">`).
* **¿Cuál recupera los valores iniciales?** El botón de tipo reset (`<input type="reset">`).
* **¿Qué hace Ayuda?** Si es un botón normal sin un comportamiento específico asignado (`type="button"` o un enlace), por defecto no hace nada a menos que se le programe una acción mediante JavaScript.

---

### d) Cambia el botón Enviar por `input type="submit"`. ¿Dónde se escribe ahora el texto del botón?

* **Respuesta:** El texto del botón ya no va envuelto entre etiquetas, sino que se define utilizando el atributo **`value`** dentro de la misma etiqueta:

---

## Ejercicio 6

### b) Prueba una URL incorrecta y un teléfono con prefijo. ¿Tel obliga a seguir un formato?

* **Respuesta sobre `type="tel"`:** Los navegadores no obligan a seguir un formato estricto de números o prefijos en los campos `tel`, ya que los formatos telefónicos varían enormemente a nivel internacional. Solo valida que se introduzca texto, a menos que se le añada una expresión regular mediante el atributo `pattern`.

---

### Añade asistentes con `number`: de 2 a 10 y `step="2"`. Prueba 4, 3 y 12. ¿Serviría `maxlength` para limitar la cantidad?

1. **Prueba de valores:**
* **4:** Es válido (está en el rango y cumple el salto de 2 en 2).
* **3:** No es válido (rompe el `step="2"` al ser un número impar).
* **12:** No es válido (supera el valor máximo permitido de 10).

2.`maxlength`:No sirve para limitar los valores numéricos en un `<input type="number">`. El atributo `maxlength` está diseñado para limitar el número de caracteres en campos de texto.

---

## Ejercicio 7


### c) Envía el formulario. ¿Qué campos aparecen en la URL? ¿Cuáles puedes modificar?

* **¿Qué campos aparecen en la URL y cuáles puedes modificar?** En la URL aparecen el campo oculto (`origen=clase`) y el campo de solo lectura (`codigo=VIS-24`).

---

### d) Busca el hidden en el código o en el inspector. ¿Serviría para guardar un dato secreto?

* **Respuesta:** No. Aunque no sea visible en la interfaz para el usuario común, cualquier persona puede ver su valor exacto haciendo clic en "Inspeccionar elemento" o viendo el código fuente, por lo que nunca debe usarse para almacenar datos secretos o contraseñas.

---

## Ejercicio 8

### d) Prueba a seleccionar archivos. No hace falta enviarlos. ¿Qué tendría que hacer el servidor para guardarlos?

* **Respuesta:** El servidor debe recibir la petición HTTP con el método `POST` y la codificación `multipart/form-data`, procesar el flujo binario temporal del archivo y escribirlo o almacenarlo físicamente en una ruta del disco duro del servidor.

---

### e) ¿`accept` comprueba el contenido? ¿Puedes elegir de antemano un fichero local con `value`?

1. **¿`accept` comprueba el contenido?** No de forma estricta. Solo sirve para filtrar visualmente en el explorador de archivos del sistema operativo.


2. **¿Puedes elegir de antemano un fichero local con `value`?** No. Por razones estrictas de seguridad y privacidad en los navegadores web, está prohibido rellenar previamente la ruta o el valor de un campo tipo `file` mediante código.

---

## Ejercicio 9

### d) Comprueba el envío y valida el HTML. Anota cuatro fallos y cómo los has corregido.

* **Fallos detectados y correcciones:**
1. **Fallo en los botones de radio:** Tenían IDs repetidos y carecían de un `name` común. *Corrección:* Se les asignó el mismo `name="turno"` para hacerlos excluyentes.


2. **Fallo en la casilla de avisos:** Usaba `checked="false"`, lo cual activa la casilla en lugar de desmarcarla. *Corrección:* Se eliminó el atributo por completo para que empiece sin marcar.


3. **Fallo en el formato de la fecha:** Tenía un formato no compatible (`2026/11/03`). *Corrección:* Se cambió al formato estándar compatible `YYYY-MM-DD` (`2026-11-03`).


4. **Fallo en la restricción de edad:** Usaba `maxlength="3"` en un input numérico. *Corrección:* Se sustituyó por los atributos correctos para rangos de números: `min="1"` y `max="120"`.

---

## Ejercicio 10

### f) Prueba Tab y pulsa las etiquetas. No anides form ni uses tabindex positivos. Valida el HTML. Distingue un error de marcado, un dato inválido y un fallo del destino. ¿Qué falta para guardar la inscripción? ¿Basta con validar en el navegador?

1. **Distinción de errores:**
* *Error de marcado:* Fallo en la sintaxis del código HTML (etiquetas mal cerradas o mal escritas).


* *Dato inválido:* El HTML es correcto, pero el usuario introduce un valor que incumple las restricciones establecidas.


* *Fallo del destino:* Un error en el servidor o en la ruta de envío (`action`) al intentar procesar los datos.




2. **¿Qué falta para guardar la inscripción?** Un script de backend en el servidor que recoja, procese y almacene los datos en una base de datos.


3. **¿Basta con validar en el navegador?** No. La validación en el cliente mejora la experiencia de usuario, pero es vulnerable y puede saltarse.


---

## Ejercicio 11

### e) Cambia el id sin cambiar for y pulsa la etiqueta. Corrígelo. Después quita name y vuelve a enviar. ¿Qué diferencia hay entre id, for, name y value?

* **Diferencias conceptuales:**
* **`id`:** Identificador único del elemento en la página.


* **`for`:** Vincula una etiqueta `<label>` con el `id` de su input para mejorar la accesibilidad y el enfoque automático.


* **`name`:** Es la clave con la que el dato viaja al servidor y sirve para agrupar controles.


* **`value`:** Es el valor real que se envía al servidor cuando se interactúa con el campo.


---

### f) ¿Por qué no basta con abrir `/post` en el navegador? ¿POST cifra los datos?

1. **¿Por qué no basta con abrir `/post` directamente?** Abrir una URL en la barra de direcciones ejecuta por defecto una petición GET. El método POST requiere enviar un cuerpo de datos estructurado generado desde un formulario.


2. **¿POST cifra los datos?** No necesariamente. POST oculta los datos de la barra de direcciones (no van en la URL), pero si la conexión utiliza HTTP, viajan en texto plano por la red.



---

## Ejercicio 12

### a) Crea un PIN obligatorio de cuatro cifras con text, inputmode="numeric" y pattern. Prueba 0007 y 007. ¿Inputmode valida el dato? ¿Por qué no usar number?

* **Pruebas y respuestas:**
* `0007` es válido; `007` no lo es al requerir estrictamente cuatro cifras (`{4}`).


* **¿Inputmode valida el dato?** No. Solo despliega el teclado numérico en pantallas táctiles por comodidad; quien valida realmente el formato es el `pattern`.


* **¿Por qué no usar number?** Porque los inputs de tipo `number` eliminan automáticamente los ceros a la izquierda (transformando el PIN `0007` en un simple `7`).


---

### b) Añade una reserva obligatoria con formato GOYA-001 y un usuario opcional de 3 a 12 letras de A a Z o cifras. Explica los formatos junto a los campos.

* **Explicación de formatos:**
* Reserva: `pattern="GOYA-[0-9]{3}"` (exige la palabra exacta "GOYA-" seguida de 3 dígitos).


* Usuario: `pattern="[A-Za-z0-9]{3,12}"` (permite entre 3 y 12 caracteres alfanuméricos).


---

### d) Anota en una tabla los valores probados y si se aceptan. Quita required del PIN y déjalo vacío. ¿Lo impide pattern?

* **Respuesta:** No lo impide. Si el campo no tiene `required` y está completamente vacío, el navegador lo da por válido y omite la comprobación del patrón.


---

### f) Comparación de cuantificadores y patrones adicionales en el PIN

* **`[0-9]+` vs `[0-9]*` vs `[0-9]{3,}`:**
* `[0-9]+` (uno o más): Acepta `7` y `007`.


* `[0-9]*` (cero o más): Acepta vacío, `7` y `007`.


* `[0-9]{3,}` (tres o más): Rechaza `7`, pero acepta `007`.


* **`GOYA-?[0-9]{2}`:** El signo `?` hace que el guion sea opcional. Acepta tanto `GOYA24` como `GOYA-24`, pero rechaza `GOYA--24`.



---

## Ejercicio 13

### c) Añade un progress sin value. Después cambia los dos primeros indicadores al máximo. ¿Qué significa cada uno? ¿Qué indica el que no tiene value?

* **Significados:**
* **Al máximo:** Indican que han alcanzado el 100% de su capacidad o valor final.


* **Sin value:** El `<progress>` sin `value` se vuelve indeterminado, indicando que una tarea se está procesando pero se desconoce el porcentaje exacto o el tiempo restante.


---

### d) Muestra 20 € con output. ¿Se calcula solo? ¿Se actualizan las barras solas? Compara estos elementos con el range del ejercicio 6.

* **Respuestas:**
* **¿Se calcula solo el output?** No. Requiere JavaScript para realizar operaciones dinámicas.


* **¿Se actualizan las barras solas?** No. Dependen de los atributos numéricos estáticos definidos.


* **Comparación con el range:** El `<input type="range">` es un control interactivo para que el usuario introduzca o modifique un valor deslizando, mientras que `<meter>` y `<progress>` son elementos de visualización u output para mostrar estados al usuario.