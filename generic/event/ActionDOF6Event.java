/*********************************************************************************
 * bogusinput_tree
 * Copyright (c) 2014 National University of Colombia, https://github.com/remixlab
 * @author Jean Pierre Charalambos, http://otrolado.info/
 *
 * All rights reserved. Library that eases the creation of interactive
 * scenes, released under the terms of the GNU Public License v3.0
 * which is available at http://www.gnu.org/licenses/gpl.html
 *********************************************************************************/
package remixlab.bogusinput.generic.event;

import remixlab.bogusinput.core.Action;
import remixlab.bogusinput.event.DOF6Event;

/**
 * Generic version of {@link remixlab.bogusinput.event.DOF6Event}.
 * <p>
 * Action events attach an {@link #action()} to the non-generic version of the event. The idea being that an
 * {@link remixlab.bogusinput.core.Agent} will at some point automatically attach the action to the
 * {@link remixlab.bogusinput.generic.event.ActionBogusEvent}.
 * 
 * @param <A>
 *          user-defined action
 */
public class ActionDOF6Event<A extends Action<?>> extends DOF6Event implements ActionBogusEvent<A> {
	Action<?> action;

	/**
	 * Convenience constructor that calls the equivalent {@link remixlab.bogusinput.event.DOF6Event} one.
	 */
	public ActionDOF6Event(float x, float y, float z, float rx, float ry, float rz, int modifiers, int button) {
		super(x, y, z, rx, ry, rz, modifiers, button);
	}

	/**
	 * Convenience constructor that calls the equivalent {@link remixlab.bogusinput.event.DOF6Event} one.
	 */
	public ActionDOF6Event(ActionDOF6Event<A> prevEvent, float x, float y, float z, float rx, float ry, float rz,
					int modifiers, int button) {
		super(prevEvent, x, y, z, rx, ry, rz, modifiers, button);
	}

	/**
	 * Convenience constructor that calls the equivalent {@link remixlab.bogusinput.event.DOF6Event} one.
	 */
	public ActionDOF6Event(float x, float y, float z, float rx, float ry, float rz) {
		super(x, y, z, rx, ry, rz);
	}

	/**
	 * Convenience constructor that calls the equivalent {@link remixlab.bogusinput.event.DOF6Event} one.
	 */
	public ActionDOF6Event(ActionDOF6Event<A> prevEvent, float x, float y, float z, float rx, float ry, float rz) {
		super(prevEvent, x, y, z, rx, ry, rz);
	}

	/**
	 * Convenience constructor that calls the equivalent {@link remixlab.bogusinput.event.DOF6Event} one and then attaches
	 * to it the given user-defined action.
	 */
	public ActionDOF6Event(float x, float y, float z, float rx, float ry, float rz, int modifiers, int button,
					Action<?> a) {
		super(x, y, z, rx, ry, rz, modifiers, button);
		action = a;
	}

	/**
	 * Convenience constructor that calls the equivalent {@link remixlab.bogusinput.event.DOF6Event} one and then attaches
	 * to it the given user-defined action.
	 */
	public ActionDOF6Event(ActionDOF6Event<A> prevEvent, float x, float y, float z, float rx, float ry, float rz,
					int modifiers, int button, Action<?> a) {
		super(prevEvent, x, y, z, rx, ry, rz, modifiers, button);
		action = a;
	}

	/**
	 * Convenience constructor that calls the equivalent {@link remixlab.bogusinput.event.DOF6Event} one and then attaches
	 * to it the given user-defined action.
	 */
	public ActionDOF6Event(float x, float y, float z, float rx, float ry, float rz, Action<?> a) {
		super(x, y, z, rx, ry, rz);
		action = a;
	}

	/**
	 * Convenience constructor that calls the equivalent {@link remixlab.bogusinput.event.DOF6Event} one and then attaches
	 * to it the given user-defined action.
	 */
	public ActionDOF6Event(ActionDOF6Event<A> prevEvent, float x, float y, float z, float rx, float ry, float rz,
					Action<?> a) {
		super(prevEvent, x, y, z, rx, ry, rz);
		action = a;
	}

	protected ActionDOF6Event(ActionDOF6Event<A> other) {
		super(other);
		action = other.action;
	}

	@Override
	public Action<?> action() {
		return action;
	}

	@Override
	public void setAction(Action<?> a) {
		if (a instanceof Action<?>)
			action = a;
	}

	@Override
	public ActionDOF6Event<A> get() {
		return new ActionDOF6Event<A>(this);
	}
}
