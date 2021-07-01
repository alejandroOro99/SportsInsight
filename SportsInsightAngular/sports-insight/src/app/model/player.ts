export class Player{

    private id: number;
	private name: string;
	private age: number;
	private marketValue: number;

    public constructor(id: number, name: string, age: number, marketValue: number){
        this.id = id;
        this.name = name;
        this.age = age;
        this.marketValue = marketValue;
    }

    public getId(): number{
        return this.id;
    }

    public getname(): string{
        return this.name;
    }

    public getAge(): number{
        return this.age;
    }

    public getMarketValue(): number{
        return this.marketValue;
    }
}