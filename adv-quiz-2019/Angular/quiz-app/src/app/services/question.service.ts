import { Injectable } from '@angular/core';
import { Question } from '../datamodel/question';

@Injectable({
  providedIn: 'root'
})
export class QuestionService {
  

  questionList : Question[] = [
    new Question('What is Angular?'),
    new Question('What is Visual Studio?')];

  constructor() { } 

  getQuestions() : Question[]{
    return this.questionList;
  }

  save(question: Question):void {
    this.questionList.push(question);
  } 
} 
