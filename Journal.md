# Journal

Phase 1
The Firewall Adapter is necessary so that the new dashboard can display messages from the legacy system that 
may not be compatible with the new system. You can display messages from the legacy firewall without needing to
the methods of the old system.

Phase 2
I had to manually unblock each port individually. It would take much longer, and I might forget some of the port numbers
or names which would be a security risk to leave them unlocked or unencrypted when they need to be locked down.

Phase 3
The facade abstracts away the methods of the other classes so they can all be controlled from the command center object.
The Main class code wouldn't need to be changed if we replaced NetworkTrafficController class, because it only needs the 
methods from the Command Center class and we would plug the new traffic controller object into the Command Center's 
constructor.
