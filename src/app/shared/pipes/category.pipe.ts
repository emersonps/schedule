import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'category'
})
export class CategoryPipe implements PipeTransform {

  transform(value: string): string {
    switch(value){
      case 'PHP': return 'code';
      case 'HTML': return 'computer';
      case 'CSS': return 'computer';
      case 'JS': return 'computer';

    }
    return 'code';
  }

}
