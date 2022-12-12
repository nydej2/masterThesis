import * as THREE from "three";
import { singleton, autoinject } from 'aurelia-framework';
import { Text } from 'troika-three-text';


type UUID = string;

@autoinject()
@singleton()
export class GraphicContext {

  /*
  vizRep(){
      this.gc.graphic_cube(8, 8, 8, "blue");
      this.gc.graphic_sphere(3, 20, 20, "red");
      this.gc.graphic_plane(3,3,"red");
}
   */

  /*
  vizRep(gc){
let map = 'data:image/png;base64,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';!
this.gc.graphic_cube(1.2, 0.6, 0.01, 'grey', map);!
}
   */
  map = '';
  object3D: {} = {};

  //this creates a craphic cube as object
  graphic_cube(width: number, height: number, depth: number, color?: string, map?: string) {

    //console.log("in graphic_cube");
    const geometry = new THREE.BoxBufferGeometry(width, height, depth, 20, 20, 20);
    const material = new THREE.MeshBasicMaterial();

    if (color)
      material.color.set(color);

    if (map) {
      this.map = map;

      // Create an image
      const image = new Image();
      // Create texture
      console.log(image);
      const texture = new THREE.Texture(image);
      // On image load, update texture
      image.onload = () => { texture.needsUpdate = true };
      // Set image source
      image.src = map;

      material.map = texture;
      material.transparent = true;
      material.color.set('white');
    }

    const box = new THREE.Mesh(geometry, material);
    this.object3D[box.uuid] = box;

    //return only used for relations
    return box;
  }

  graphic_sphere(radius: number, withSegments: number, heightSegments: number, color?: string, map?: string) {
    let geometry = new THREE.SphereGeometry(radius, withSegments, heightSegments);
    let material = new THREE.MeshBasicMaterial();

    if (color)
      material.color.set(color);

    if (map) {
      this.map = map;

      // Create an image
      const image = new Image(); // or document.createElement('img' );
      // Create texture
      let texture = new THREE.Texture(image);
      // On image load, update texture
      image.onload = () => { texture.needsUpdate = true };
      // Set image source
      image.src = map;

      material.map = texture;
      material.transparent = true;
      material.color.set('white');
    }

    let sphere = new THREE.Mesh(geometry, material);
    this.object3D[sphere.uuid] = sphere;

    //return only used for relations
    return sphere;
  }

  graphic_plane(width: number, height: number, color?: string, map?: string) {

    //console.log("in graphic_plane");
    let geometry = new THREE.PlaneGeometry(width, height, 20, 20);
    let material = new THREE.MeshBasicMaterial();

    if (color)
      material.color.set(color);

    if (map) {
      this.map = map;

      // Create an image
      const image = new Image();
      // Create texture
      let texture = new THREE.Texture(image);
      // On image load, update texture
      image.onload = () => { texture.needsUpdate = true };
      // Set image source
      image.src = map;

      material.map = texture;
      material.transparent = true;
      material.color.set('white');
    }

    let plane = new THREE.Mesh(geometry, material);
    this.object3D[plane.uuid] = plane;

    plane.material.side = THREE.DoubleSide;
    //return only used for relations
    return plane;
  }

  }
