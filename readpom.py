def managePom(update=False):
    from xml.etree import ElementTree as et
    ns = "http://maven.apache.org/POM/4.0.0"
    et.register_namespace('', ns)
    tree = et.ElementTree()
    tree.parse('pom.xml')
    p = tree.getroot().find("{%s}version" % ns)
    ver_split = p.text.split('.')
    print(ver_split)
    inc_ver = int(ver_split[-1])+1
    updated_ver = ver_split[0:-1]
    updated_ver.append(str(inc_ver))
    print(updated_ver)
    pom_ver = '.'.join(updated_ver)
    print(pom_ver)
    if update:
        p.text = pom_ver
        tree.write('pom.xml')
    else:
        return p.text

managePom(update=True)