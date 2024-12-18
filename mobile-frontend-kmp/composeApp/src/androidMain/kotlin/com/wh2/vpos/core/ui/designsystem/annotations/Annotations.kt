package com.wh2.vpos.core.ui.designsystem.annotations

/**
 * [UIElement] is the most basic element that composes a UI.
 * La mayoria de los elementos nativos en la UI pertenecen a esta categoria (Text, Icon, TextField, Button, etc).
 * Adaptandolo a Atomic Design, [UIElement] haria las veces de un átomo.
 * <img src="https://atomicdesign.bradfrost.com/images/content/atomic-design-atoms.png">
 *
 * @see <a href="https://atomicdesign.bradfrost.com/chapter-2/?source=post_page-----1395502c5c05--------------------------------#atoms">Atomic design :: Atoms</a>
 */
annotation class UIElement

/**
 * [UIComponent] se conforma de varios [UIElement] que conforman un componente visual que funciona como una unidad.
 * El [UIComponent] es un componente reutilizable que puede ser instanciado en cualquier funcionalidad de la app.
 * Adaptandolo a Atomic Design, [UIComponent] haria las veces de una molecula.
 * <img src="https://atomicdesign.bradfrost.com/images/content/atomic-design-molecules.png">
 *
 * @see <a href="https://atomicdesign.bradfrost.com/chapter-2/?source=post_page-----1395502c5c05--------------------------------#molecules">Atomic design :: Molecules</a>
 */
annotation class UIComponent

/**
 * Se compone de varios [UIComponent].
 * Adaptandolo a Atomic Design, [UISection] haria las veces de un organismo.
 * <img src="https://atomicdesign.bradfrost.com/images/content/atomic-design-organisms.png">
 *
 * @see <a href="https://atomicdesign.bradfrost.com/chapter-2/?source=post_page-----1395502c5c05--------------------------------#organisms">Atomic design :: Organisms</a>
 */
annotation class UISection

/**
 * Conformado por varios [UISection], ademas de definir espacios donde se puedan alojar componentes y secciones.
 * Entrarian en esta categoria los Custom Scaffolds, asi como aquellos composables que implementen un Slot API pattern.
 * Adaptandolo a Atomic Design, [UITemplate] haria las veces de un template.
 * <img src="https://atomicdesign.bradfrost.com/images/content/atomic-design-templates.png">
 *
 * @see <a href="https://atomicdesign.bradfrost.com/chapter-2/?source=post_page-----1395502c5c05--------------------------------#templates">Atomic design :: Templates</a>
 */
annotation class UITemplate

/**
 * Implementacion de un [UITemplate] concreto,
 * Adaptandolo a Atomic Design, [UIScreen] haria las veces de una pagina.
 * <img src="https://atomicdesign.bradfrost.com/images/content/atomic-design-pages.png">
 *
 * @see <a href="https://atomicdesign.bradfrost.com/chapter-2/?source=post_page-----1395502c5c05--------------------------------#pages">Atomic design :: Pages</a>
 */
annotation class UIScreen

/**
 * [NavRoute] se encarga de gestionar las dependencias que requiere una [UIScreen], ademas de permitir la integracion
 * de la [UIScreen] a un grafo de navegación,
 */
annotation class NavRoute
